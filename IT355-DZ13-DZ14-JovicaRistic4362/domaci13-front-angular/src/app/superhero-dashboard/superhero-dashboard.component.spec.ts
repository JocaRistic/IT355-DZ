import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuperheroDashboardComponent } from './superhero-dashboard.component';

describe('SuperheroDashboardComponent', () => {
  let component: SuperheroDashboardComponent;
  let fixture: ComponentFixture<SuperheroDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SuperheroDashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SuperheroDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
