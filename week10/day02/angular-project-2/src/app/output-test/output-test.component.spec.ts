import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OutputTestComponent } from './output-test.component';

describe('OutputTestComponent', () => {
  let component: OutputTestComponent;
  let fixture: ComponentFixture<OutputTestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OutputTestComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OutputTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
