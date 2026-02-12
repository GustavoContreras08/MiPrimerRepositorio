import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarPadre } from './listar-padre';

describe('ListarPadre', () => {
  let component: ListarPadre;
  let fixture: ComponentFixture<ListarPadre>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListarPadre]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarPadre);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
