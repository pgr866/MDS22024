import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-configurarperfil')
export class VistaConfigurarperfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 15%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 40%; height: 85%; flex-shrink: 0; justify-content: space-between; padding-top: var(--lumo-space-s); padding-bottom: var(--lumo-space-s);">
  <vaadin-button style="flex-shrink: 0; align-self: center; width: 100%; height: 40%;">
   <img style="width: 100%; height: 100%;" src="">
  </vaadin-button>
  <vaadin-vertical-layout style="width: 100%; height: 40%; justify-content: space-between; flex-shrink: 0;">
   <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;">
    <label style="flex-shrink: 0; width: 30%; flex-grow: 0;">Nombre</label>
    <vaadin-text-field placeholder="Nombre" style="flex-shrink: 0; width: 70%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;">
    <label style="flex-shrink: 0; width: 30%; flex-grow: 0;">Apodo</label>
    <vaadin-text-field placeholder="Apodo" style="flex-shrink: 0; width: 70%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;">
    <label style="flex-shrink: 0; width: 30%; flex-grow: 0;">Email</label>
    <vaadin-text-field placeholder="Email" style="flex-shrink: 0; width: 70%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;">
    <label style="flex-shrink: 0; width: 30%; flex-grow: 0;">Nº Tarjeta</label>
    <vaadin-text-field placeholder="Nº Tarjeta" style="flex-shrink: 0; width: 70%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 15%; flex-shrink: 0; align-items: center;">
    <label style="flex-shrink: 0; width: 30%; flex-grow: 0;">Contraseña</label>
    <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; width: 70%;" has-value></vaadin-password-field>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 10%; justify-content: space-between;">
   <vaadin-button style="flex-shrink: 0; width: 47%; align-self: center;">
    Eliminar cuenta
   </vaadin-button>
   <vaadin-button style="flex-shrink: 0; width: 47%; align-self: center;">
    Guardar cambios
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
