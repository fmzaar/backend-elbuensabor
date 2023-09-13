package com.magiestos.elbuensabor;

import com.magiestos.elbuensabor.entidades.*;
import com.magiestos.elbuensabor.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElbuensaborApplication {
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	FacturaRepository facturaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ElbuensaborApplication.class, args);
	}

	@Bean //HARDCODE de relación Cliente -> Pedido
	public CommandLineRunner init(ClienteRepository clienteRepo) {
		return args -> {
			System.out.println("----- Y arranco nomás... -----");

			Pedido pedido1 = Pedido.builder()
					.fecha("27/08/1999")
					.estado("Iniciado")
					.horaEstimadaEntrega(System.currentTimeMillis())
					.TipoEnvio("Delivery")
					.total(100.0)
					.build();

			Pedido pedido2 = Pedido.builder()
					.fecha("27/08/2000")
					.estado("Preparacion")
					.horaEstimadaEntrega(System.currentTimeMillis())
					.TipoEnvio("Retira")
					.total(150.0)
					.build();

			Cliente cliente1 = Cliente.builder()
					.nombre("Franco")
					.apellido("Suarez")
					.email("email@email.com")
					.telefono("4322787")
					.build();

			cliente1.agregarPedido(pedido1);
			cliente1.agregarPedido(pedido2);

			//Guardar en base de datos
			clienteRepo.save(cliente1);

			//Recuperar desde base de datos

			Cliente clienteRecuperado = clienteRepository.findById(cliente1.getId()).orElse(null);
			if (clienteRecuperado != null) {
				System.out.println("Nombre: " + clienteRecuperado.getNombre());
				System.out.println("Apellido: " + clienteRecuperado.getApellido());
				System.out.println("Email: " + clienteRecuperado.getEmail());
				System.out.println("Telefono: " + clienteRecuperado.getTelefono());
				clienteRecuperado.mostrarPedidos();
			}
		};

	}

	@Bean //HARDCODE de relación Pedido -> Factura
	public CommandLineRunner init2(PedidoRepository pedidoRepo) {
		return args -> {
			System.out.println("----- Y arranco nomás... -----");

			Factura factura = Factura.builder()
					.fecha(System.currentTimeMillis())
					.numero(1)
					.descuento(20.0)
					.formaPago("MercadoPago")
					.total(100)
					.build();

			Pedido pedido1 = Pedido.builder()
					.fecha("27/08/1999")
					.estado("Iniciado")
					.horaEstimadaEntrega(System.currentTimeMillis())
					.TipoEnvio("Delivery")
					.total(100.0)
					.build();

			pedido1.setFactura(factura);

			//Guardar en base de datos
			pedidoRepo.save(pedido1);

			//Recuperar desde base de datos

			Pedido pedidoRecuperado = pedidoRepository.findById(pedido1.getId()).orElse(null);
			if (pedidoRecuperado != null) {
				System.out.println("Fecha: " + pedidoRecuperado.getFecha());
				System.out.println("Estado: " + pedidoRecuperado.getEstado());
				System.out.println("Hora estimada de Entrega: " + pedidoRecuperado.getHoraEstimadaEntrega());
				System.out.println("Tipo de Envio: " + pedidoRecuperado.getTipoEnvio());
				System.out.println("Total: $" + pedidoRecuperado.getTotal());
				System.out.println("Nro Factura: " + pedidoRecuperado.getFactura().getNumero());
				System.out.println("Fecha Factura: " + pedidoRecuperado.getFactura().getFecha());
				System.out.println("Descuento: " + pedidoRecuperado.getFactura().getDescuento());
				System.out.println("Forma de pago: " + pedidoRecuperado.getFactura().getFormaPago());
				System.out.println("Total factura: $" + pedidoRecuperado.getFactura().getTotal());
			}
		};

	}

	@Bean //HARDCODE de relación Domicilio -> Cliente
	public CommandLineRunner init3(DomicilioRepository domicilioRepo) {
		return args -> {
			System.out.println("----- Y arranco nomás... -----");

			Domicilio domicilio = Domicilio.builder()
					.calle("Calle 1")
					.numero(123)
					.localidad("Dorrego")
					.build();

			Cliente cliente1 = Cliente.builder()
					.nombre("Franco")
					.apellido("Suarez")
					.email("email@email.com")
					.telefono("4322787")
					.build();

			domicilio.setCliente(cliente1);

			//Guardar en base de datos
			domicilioRepo.save(domicilio);

			//Recuperar desde base de datos

			Domicilio domicilioRecuperado = domicilioRepo.findById(domicilio.getId()).orElse(null);
			if (domicilioRecuperado != null) {
				System.out.println("Calle: " + domicilioRecuperado.getCalle());
				System.out.println("Numero: " + domicilioRecuperado.getNumero());
				System.out.println("Localidad: " + domicilioRecuperado.getLocalidad());
				System.out.println("Cliente: " + domicilioRecuperado.getCliente().getNombre() + " " + domicilioRecuperado.getCliente().getApellido());
			}
		};
	}
}
