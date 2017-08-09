package br.com.pessoa.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.pessoa.event.RecursoCriadoEvent;

@Component
public class RecursoCriadoListener {

	@EventListener
    public void handleResponseLocationHeader(RecursoCriadoEvent event) {
        HttpServletResponse response = event.getResponse();
        Long codigoRecurso = event.getCodigo();

        URI locationURI = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{codigo}")
                .buildAndExpand(codigoRecurso)
                .toUri();

        response.addHeader("Location", locationURI.toASCIIString());
    }

}
