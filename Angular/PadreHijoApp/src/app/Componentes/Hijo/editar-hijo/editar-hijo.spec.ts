import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarHijo } from './editar-hijo';

describe('EditarHijo', () => {
  let component: EditarHijo;
  let fixture: ComponentFixture<EditarHijo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditarHijo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarHijo);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
