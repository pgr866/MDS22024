import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuarionoregistrado')
export class VistaUsuarionoregistrado extends LitElement {
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
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0;" id="Layoutlogonoregistrado">
   <vaadin-button theme="icon" ; style="height: 100%; width: 100%; flex-shrink: 1; background-color: #F2F2F2;" id="Logonoregistrado">
    <img src="https://i.postimg.cc/PJ6nS7hm/logo.png" width="" alt="logo" style="width: 100%; height: 100%;" id="Fotologonoregistrado">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; width: 72%;">
   <vaadin-vertical-layout style="width: 100%; height: 50%; flex-shrink: 0;">
    <vaadin-horizontal-layout id="Barrabusquedanoregistrado" style="width: 100%; height: 100%; flex-shrink: 0; position: relative; padding: 0;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="Layoutexplorarseccionesnoregistrado1" style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between; padding: 0;">
    <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Explorarseccionesnoregistrado">
      Explorar secciones 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 1; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); flex-grow: 0;" id="Layoutiniciarsesion">
   <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Iniciarsesion">
     Iniciar sesion 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; flex-grow: 0; width: 100%;">
  <vaadin-vertical-layout style="flex-shrink: 0; width: 15%;">
   <vaadin-vertical-layout style="flex-grow: 0; flex-shrink: 0; position: relative; width: 100%; padding: 0;" id="Layoutanuncioizquierdausuarionoregistrado"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 0; width: 70%;">
   <vaadin-vertical-layout style="flex-shrink: 0; flex-grow: 0; position: relative; width: 100%; flex-direction: row; flex-wrap: wrap; align-content: space-between; padding: 0;" id="Layoutnoticiasportadausuarionoregistrado"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 0; width: 15%;">
   <vaadin-vertical-layout style="flex-grow: 0; flex-shrink: 0; position: relative; width: 100%; padding: 0;" id="Layoutanuncioderechausuarionoregistrado"></vaadin-vertical-layout>
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
