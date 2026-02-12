import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuardarPadre } from './guardar-padre';

describe('GuardarPadre', () => {
  let component: GuardarPadre;
  let fixture: ComponentFixture<GuardarPadre>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GuardarPadre]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuardarPadre);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
