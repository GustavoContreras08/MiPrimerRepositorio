package com.mx.ClientePedido.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ClientePedido.Dominio.Pedido;
import com.mx.ClientePedido.Service.PedidoService;

@RestController
@RequestMapping(path = "api/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("listar")
    public ResponseEntity<?> listar() {

        if (service.listar().isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(service.listar());
        }
    }

    @PostMapping("guardar")
    public ResponseEntity<String> guardar(@RequestBody Pedido pedido) {

        Pedido encontrado = service.buscar(pedido.getIdPedido());

        if (encontrado == null) {
            service.guardar(pedido);
            return ResponseEntity.status(HttpStatus.CREATED).body("El pedido se registro con exito");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("El ID ya existe");
        }
    }

    @PutMapping("editar")
    public ResponseEntity<String> editar(@RequestBody Pedido pedido) {

        Pedido encontrado = service.buscar(pedido.getIdPedido());

        if (encontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El ID que intentas editar no existe");
        } else {
            service.editar(pedido);
            return ResponseEntity.ok("Edicion exitosa");
        }
    }

    @DeleteMapping("eliminar/{idPedido}")
    public ResponseEntity<String> eliminar(@PathVariable int idPedido) {

        Pedido encontrado = service.buscar(idPedido);

        if (encontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se puede eliminar porque no existe");
        } else {
            service.eliminar(idPedido);
            return ResponseEntity.ok("Eliminacion exitosa");
        }
    }

    @GetMapping("buscar/{idPedido}")
    public ResponseEntity<?> buscar(@PathVariable int idPedido) {

        Pedido encontrado = service.buscar(idPedido);

        if (encontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe ese registro");
        } else {
            return ResponseEntity.ok(encontrado);
        }
    }

    @GetMapping("listarPorFecha")
    public ResponseEntity<?> listarPorFecha(@RequestParam LocalDate fecha) {

        if (service.listarPorFecha(fecha).isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(service.listarPorFecha(fecha));
        }
    }
}