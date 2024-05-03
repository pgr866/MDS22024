import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 98%; height: 100%; position: absolute;">
 <vaadin-horizontal-layout class="header" style="background-color: #EBEBEB; width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-s); flex-grow: 0; justify-content: space-between; height: 15%;">
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0;" id="Layoutlogoidentificado">
   <vaadin-button theme="icon" ; style="height: 100%; width: 100%; flex-shrink: 1; background-color: #EBEBEB;" id="Buttonlogoidentificado">
    <img src="https://i.postimg.cc/PJ6nS7hm/logo.png" width="" alt="logo" style="width: 100%; height: 100%;" id="imagenlogoidentificado">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; width: 72%;">
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; flex-grow: 0;" id="Layoutvistabuscaridentificado"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between; flex-wrap: wrap;">
    <vaadin-vertical-layout style="flex-shrink: 1; width: 30%; height: 100%;" id="Layoutexplorarseccionesidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Explorarseccionesidentificado">
       Explorar secciones 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutvermisnoticiasidentificado"></vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutcrearnuevanoticiaidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Buttoncrearnuevanoticiaidentificado">
       Crear nueva noticia 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutvistanoticiasarevisaridentificado"></vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%;" id="Layoutdaraltabajaperiodistaidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Buttondaraltabajaperiodistaidentificado">
       Dar Alta/Baja Periodista 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0; flex-grow: 0; justify-content: space-between; flex-direction: row; padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);" id="Opcionescuentaidentificado">
   <vaadin-button style="height: 100%; flex-shrink: 0; width: 45%; align-self: center; background-color: #EBEBEB;" id="Configurarperfilidentificado">
    <img style="height: 100%; width: 100%;" src="" id="Imagenconfigurarperfilidentificado">
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; flex-shrink: 0; flex-grow: 1; padding-top: var(--lumo-space-s); padding-bottom: var(--lumo-space-s); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 100%; flex-grow: 0; flex-shrink: 0; flex-direction: row; align-content: space-between; flex-wrap: wrap;" id="Layoutnoticiasportadaidentificado"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
