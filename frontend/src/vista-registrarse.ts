import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; padding-top: var(--lumo-space-m); padding-right: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
 <vaadin-horizontal-layout id="Layoutlogin" style="width: 100%; height: 25%; flex-shrink: 0; justify-content: space-between;">
  <vaadin-button theme="icon" ; style="height: 100%; width: 20%; flex-shrink: 0; background-color: #FFFFFF;">
   <img src="../../src/main/resources/META-INF/resources/images/logo.svg" width="" alt="logo" style="width: 100%; height: 100%;">
  </vaadin-button>
  <label style="width: 70%; height: 100%; flex-shrink: 0; font-size: 500%;">Registrarse</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; width: 50%; flex-grow: 0; justify-content: space-evenly; height: 75%;">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Email</label>
    <vaadin-text-field placeholder="Email" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Nombre</label>
    <vaadin-text-field placeholder="Nombre" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Apellidos</label>
    <vaadin-text-field placeholder="Apellidos" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Fecha Nacimiento</label>
    <vaadin-text-field placeholder="Fecha Nacimiento" style="flex-shrink: 0; width: 80%; align-self: center;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Apodo</label>
    <vaadin-text-field placeholder="Apodo" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">DNI</label>
    <vaadin-text-field placeholder="DNI" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Nº Tarjeta</label>
    <vaadin-text-field placeholder="Nº Tarjeta" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Contraseña</label>
    <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; width: 80%;" has-value></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;">
    <label style="width: 20%; flex-shrink: 0; align-self: center;">Repetir Contraseña</label>
    <vaadin-password-field placeholder="Repetir Contraseña" style="flex-shrink: 0; width: 80%; align-self: center;" has-value></vaadin-password-field>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; justify-content: space-around;">
   <vaadin-button style="flex-shrink: 0; align-self: center; width: 40%;">
    Cancelar
   </vaadin-button>
   <vaadin-button style="flex-shrink: 0; align-self: center; width: 40%;">
    Enviar
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
