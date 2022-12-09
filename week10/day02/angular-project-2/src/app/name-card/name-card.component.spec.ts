import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NameCardComponent } from './name-card.component';

describe('NameCardComponent', () => {
  let component: NameCardComponent;
  let fixture: ComponentFixture<NameCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NameCardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NameCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
