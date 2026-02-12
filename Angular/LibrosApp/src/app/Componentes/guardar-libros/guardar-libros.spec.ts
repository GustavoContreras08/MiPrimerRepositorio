import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuardarLibros } from './guardar-libros';

describe('GuardarLibros', () => {
  let component: GuardarLibros;
  let fixture: ComponentFixture<GuardarLibros>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GuardarLibros]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuardarLibros);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
