package com.metropolitan.domaci9;

import com.metropolitan.domaci9.controller.PublisherController;
import com.metropolitan.domaci9.model.Publisher;
import com.metropolitan.domaci9.service.PublisherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Optional;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = PublisherController.class)
public class PublisherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PublisherService publisherService;

    @Test
    public void testGetAllPublishers() throws Exception {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");

        when(publisherService.findAll()).thenReturn(Arrays.asList(publisher));

        mockMvc.perform(get("/publisher"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Publisher naziv")));
    }

    @Test
    public void testGetPublisherById() throws Exception {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");

        when(publisherService.findById(1)).thenReturn(Optional.of(publisher));

        mockMvc.perform(get("/publisher/1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Publisher naziv")));
    }

    @Test
    public void testSavePublisher() throws Exception {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");

        when(publisherService.save(any(Publisher.class))).thenReturn(publisher);

        mockMvc.perform(post("/publisher")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\": \"Publisher naziv\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Publisher naziv")));
    }

    @Test
    public void testUpdatePublisher() throws Exception {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Updated Publisher");

        when(publisherService.update(any(Publisher.class))).thenReturn(publisher);

        mockMvc.perform(put("/publisher")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\": \"Updated Publisher\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Updated Publisher")));
    }

    @Test
    public void testDeletePublisher() throws Exception {
        doNothing().when(publisherService).deleteById(1);

        mockMvc.perform(delete("/publisher/1"))
                .andExpect(status().isOk());
    }

}
