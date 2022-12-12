import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderAsideComponent } from './header-aside.component';

describe('HeaderAsideComponent', () => {
  let component: HeaderAsideComponent;
  let fixture: ComponentFixture<HeaderAsideComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeaderAsideComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeaderAsideComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
