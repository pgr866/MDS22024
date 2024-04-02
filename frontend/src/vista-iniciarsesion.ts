import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

@customElement('vista-iniciarsesion')
export class VistaIniciarsesion extends LitElement {
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
  <label style="width: 70%; height: 100%; flex-shrink: 0; font-size: 500%;">Iniciar sesión</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; width: 50%; flex-grow: 0; justify-content: space-evenly; height: 50%;">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <label style="width: 20%; flex-shrink: 0; align-self: center; font-size: 120%;">Usuario </label>
    <vaadin-text-field placeholder="Nombre Usuario" id="Usernamelogin" style="flex-shrink: 0; width: 80%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;">
    <label style="width: 20%; flex-shrink: 0; align-self: center; font-size: 120%;">Contraseña</label>
    <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; width: 80%;" has-value></vaadin-password-field>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-button style="flex-shrink: 0; align-self: center; width: 20%;">
    Entrar 
  </vaadin-button>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; justify-content: space-around;">
   <label style="flex-shrink: 0; font-size: 150%;">¿No estas registrado?</label>
   <vaadin-button style="flex-shrink: 0; align-self: center; width: 40%;">
     Registrarse 
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
