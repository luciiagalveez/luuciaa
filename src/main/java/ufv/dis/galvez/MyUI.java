package ufv.dis.galvez;

import java.io.FileNotFoundException;

import javax.servlet.annotation.WebServlet;

import com.itextpdf.text.DocumentException;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import ufv.dis.galvez.GeneradorPDF;
import ufv.dis.galvez.Lista;
import ufv.dis.galvez.Usuario;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        Lista lista = new Lista();
        
        final TextField nombre = new TextField();
        nombre.setCaption("Nombre:");
        final TextField ape = new TextField();
        ape.setCaption("Apellido:");
        final TextField email = new TextField();
        email.setCaption("Email:");
        final TextField DNI = new TextField();
        DNI.setCaption("DNI sin letra: ");
        final TextField fnac = new TextField();
        fnac.setCaption("Fecha de nacimiento:");

        Button button = new Button("GUARDAR");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Usuario " + nombre.getValue() 
                    + " guardado"));
            
          	//paso string a num entero
        	Usuario u = new Usuario(nombre.getValue(), ape.getValue(), email.getValue(), Integer.parseInt(DNI.getValue()), Integer.parseInt(fnac.getValue()));
        	lista.addUsuario(u);
        	
        	
        	try{
        	GeneradorPDF.generarPDF(u);
        	Notification.show("PDF generado con exito!");
        	}catch (FileNotFoundException | DocumentException e1){
        	e1.printStackTrace();
        	}
        });
        
        layout.addComponents(nombre, ape, email, DNI, fnac, button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
