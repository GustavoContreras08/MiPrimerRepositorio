import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarLibros } from './listar-libros';

describe('ListarLibros', () => {
  let component: ListarLibros;
  let fixture: ComponentFixture<ListarLibros>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListarLibros]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarLibros);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
