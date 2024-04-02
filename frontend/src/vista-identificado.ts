import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-mostrarmisnoticias';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-noticiasarevisar';
import './vista-listadonoticiasportada';
import './vista-logout';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-buscar';

@customElement('vista-identificado')
export class VistaIdentificado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-horizontal-layout class="header" style="background-color: #EBEBEB; width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-s); flex-grow: 0; justify-content: space-between; height: 15%;">
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0;" id="Layoutlogoidentificado">
   <vaadin-button theme="icon" ; style="height: 100%; width: 100%; flex-shrink: 1; background-color: #EBEBEB;" id="Buttonlogoidentificado">
    <img src="../../src/main/resources/META-INF/resources/images/logo.svg" width="" alt="logo" style="width: 100%; height: 100%;" id="imagenlogoidentificado">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; width: 72%;">
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; flex-grow: 0;" id="Layoutvistabuscaridentificado">
    <vista-buscar style="flex-shrink: 0; width: 100%; height: 100%;" id="vistabuscaridentificado"></vista-buscar>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between; flex-wrap: wrap;">
    <vaadin-vertical-layout style="flex-shrink: 1; width: 30%; height: 100%;" id="Layoutexplorarseccionesidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Explorarseccionesidentificado">
       Explorar secciones 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutvermisnoticiasidentificado">
     <vista-mostrarmisnoticias style="width: 100%; height: 100%; flex-shrink: 0;" id="Vistavermisnoticiasidentificado"></vista-mostrarmisnoticias>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutcrearnuevanoticiaidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Buttoncrearnuevanoticiaidentificado">
       Crear nueva noticia 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutvistanoticiasarevisaridentificado">
     <vista-noticiasarevisar style="flex-shrink: 0; width: 100%; height: 100%;" id="Vistanoticiasarevisaridentificado"></vista-noticiasarevisar>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutdaraltabajaperiodistaidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Buttondaraltabajaperiodistaidentificado">
       Dar Alta/Baja Periodista 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0; flex-grow: 0; justify-content: space-between; flex-direction: row; padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);" id="Opcionescuentaidentificado">
   <vaadin-button style="height: 100%; flex-shrink: 0; width: 45%; align-self: center; background-color: #EBEBEB;" id="Configurarperfilidentificado">
    <img style="height: 100%; width: 100%;" src="../../src/main/resources/META-INF/resources/images/cuenta.png" id="Imagenconfigurarperfilidentificado">
   </vaadin-button>
   <vista-logout style="flex-shrink: 0; width: 45%; height: 100%; align-self: center;" id="vistalogoutidentificado"></vista-logout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; flex-shrink: 0; flex-grow: 1; padding-top: var(--lumo-space-s); padding-bottom: var(--lumo-space-s); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 100%; flex-grow: 0; flex-shrink: 0; flex-direction: row; align-content: space-between; flex-wrap: wrap;" id="Layoutnoticiasportadaidentificado">
   <vista-listadonoticiasportada style="width: 100%; flex-shrink: 0; height: 100%;" id="vistanoticiasportadaidentificado"></vista-listadonoticiasportada>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
