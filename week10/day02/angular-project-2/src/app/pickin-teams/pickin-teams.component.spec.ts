import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PickinTeamsComponent } from './pickin-teams.component';

describe('PickinTeamsComponent', () => {
  let component: PickinTeamsComponent;
  let fixture: ComponentFixture<PickinTeamsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PickinTeamsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PickinTeamsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
