import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
 <vaadin-horizontal-layout class="header" style="background-color: #F2F2F2; width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-s); flex-grow: 0; justify-content: space-between; height: 15%;">
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0;" id="Layoutlogoidentificado">
   <vaadin-button theme="icon" ; style="height: 100%; width: 100%; flex-shrink: 1; background-color: #F2F2F2;" id="Buttonlogoidentificado">
    <img src="https://i.postimg.cc/PJ6nS7hm/logo.png" width="" alt="logo" style="width: 100%; height: 100%;" id="imagenlogoidentificado">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; width: 72%;">
   <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 50%;" id="Layoutbuscaridentificado">
    <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-grow: 0; position: relative; height: 100%;" id="Layoutvistabuscaridentificado"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 50%;" id="Layoutbuscareditor">
    <vaadin-horizontal-layout id="Layoutvistabuscareditor" style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; position: relative;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between; flex-wrap: wrap; padding: 0;">
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%; flex-grow: 0; padding: 0;" id="Layoutexplorarseccionesidentificado">
     <vaadin-button style="width: 100%; flex-shrink: 1; flex-grow: 0; height: 100%;" id="Explorarseccionesidentificado">
       Explorar secciones 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 30%; height: 100%; flex-shrink: 0; padding: 0;" id="Layoutvistavermisnoticiasidentificado">
     <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 100%; position: relative; padding: 0;" id="Layoutvermisnoticiasidentificado"></vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%; padding: 0;" id="Layoutcrearnuevanoticiaidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Buttoncrearnuevanoticiaidentificado">
       Crear nueva noticia 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 30%; flex-shrink: 0; height: 100%; padding: 0;" id="Layoutnoticiasarevisaridentificado">
     <vaadin-vertical-layout style="flex-shrink: 0; position: relative; width: 100%; height: 100%; padding: 0;" id="Layoutvistanoticiasarevisaridentificado"></vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="flex-shrink: 0; width: 30%; height: 100%; padding: 0;" id="Layoutdaraltabajaperiodistaidentificado">
     <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Buttondaraltabajaperiodistaidentificado">
       Dar Alta/Baja Periodista 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0; flex-grow: 0; flex-direction: row;">
   <vaadin-button style="flex-shrink: 0; width: 50%; background-color: #F2F2F2; height: 100%; padding: var(--lumo-space-m);" id="Configurarperfilidentificado"></vaadin-button>
   <vaadin-vertical-layout style="width: 50%; height: 100%; flex-shrink: 0;">
    <vaadin-vertical-layout id="Logoutopcionescuentaidentificado" style="flex-shrink: 0; position: relative; flex-grow: 0; width: 100%; height: 100%;"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; flex-grow: 0; padding-left: var(--lumo-space-l); padding-right: var(--lumo-space-l);">
  <vaadin-vertical-layout style="width: 100%; flex-grow: 0; flex-shrink: 0; flex-direction: row; align-content: space-between; flex-wrap: wrap; position: relative; padding: 0;" id="Layoutnoticiasportadaidentificado"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
