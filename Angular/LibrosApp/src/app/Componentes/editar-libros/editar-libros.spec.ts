import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarLibros } from './editar-libros';

describe('EditarLibros', () => {
  let component: EditarLibros;
  let fixture: ComponentFixture<EditarLibros>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditarLibros]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarLibros);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
