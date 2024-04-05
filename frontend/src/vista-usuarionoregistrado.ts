import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding-bottom: var(--lumo-space-s); position: absolute;">
 <vaadin-horizontal-layout class="header" style="background-color: #EBEBEB; width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-s); flex-grow: 0; justify-content: space-between; height: 15%;">
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 0;" id="Layoutligonoregistrado">
   <vaadin-button theme="icon" ; style="height: 100%; width: 100%; flex-shrink: 1; background-color: #EBEBEB;" id="Logonoregistrado">
    <img src="../../src/main/resources/META-INF/resources/images/logo.svg" width="" alt="logo" style="width: 100%; height: 100%;" id="Fotologonoregistrado">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; width: 72%;">
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0;" id="Barrabusquedanoregistrado"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 50%; flex-shrink: 0; justify-content: space-between;" id="Layoutexplorarseccionesnoregistrado">
    <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0;" id="Explorarseccionesnoregistrado">
      Explorar secciones 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 12%; height: 100%; flex-shrink: 1; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); flex-grow: 0;" id="Layoutiniciarsesion">
   <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1;" id="Iniciarsesion">
     Iniciar sesion 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; flex-shrink: 0; flex-grow: 1; padding-top: var(--lumo-space-s);">
  <vaadin-vertical-layout style="width: 15%; flex-shrink: 0; flex-grow: 0; height: 100%;" id="Layoutanuncioizquierdausuarionoregistrado"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 70%; flex-grow: 0; flex-shrink: 0; flex-direction: row; align-content: space-between; flex-wrap: wrap;" id="Layoutnoticiasportadausuarionoregistrado"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 15%; flex-shrink: 0;" id="Layoutanuncioderechausuarionoregistrado"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
