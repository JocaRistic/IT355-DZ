package com.metropolitan.domaci9;

import com.metropolitan.domaci9.model.Publisher;
import com.metropolitan.domaci9.repository.PublisherRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Transactional
public class PublisherCrudTest {

    @Autowired
    private PublisherRepository publisherRepository;

    @Test
    public void testGetAllPublishers() {

        Publisher publisher1 = new Publisher();
        publisher1.setPublisher("Publisher naziv 1");

        Publisher publisher2 = new Publisher();
        publisher2.setPublisher("Publisher naziv 2");

        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);

        List<Publisher> publishers = publisherRepository.findAll();

        assertThat(publishers).hasSize(2)
                .containsExactlyInAnyOrder(publisher1, publisher2);
    }

    @Test
    public void testFindPublisherById() {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");
        Publisher savedPublisher = publisherRepository.save(publisher);
        Optional<Publisher> foundPublisher = publisherRepository.findById(savedPublisher.getId());
        assertThat(foundPublisher).isPresent().hasValue(savedPublisher);
    }

    @Test
    public void testSavePublisher() {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");
        Publisher savedPublisher = publisherRepository.save(publisher);
        assertThat(savedPublisher).isNotNull();
        assertThat(savedPublisher.getId()).isNotNull();
    }

    @Test
    public void testUpdatePublisher() {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");
        Publisher savedPublisher = publisherRepository.save(publisher);
        savedPublisher.setPublisher("Updated Publisher");
        Publisher updatedPublisher = publisherRepository.save(savedPublisher);
        assertThat(updatedPublisher.getPublisher()).isEqualTo("Updated Publisher");
    }

    @Test
    public void testDeletePublisher() {
        Publisher publisher = new Publisher();
        publisher.setPublisher("Publisher naziv");
        Publisher savedPublisher = publisherRepository.save(publisher);
        publisherRepository.deleteById(savedPublisher.getId());
        Optional<Publisher> deletedPublisher = publisherRepository.findById(savedPublisher.getId());
        assertThat(deletedPublisher).isNotPresent();
    }
}
