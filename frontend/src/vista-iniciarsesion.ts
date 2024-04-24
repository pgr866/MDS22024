import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <vaadin-horizontal-layout id="Layoutlogin" style="width: 100%; height: 25%; flex-shrink: 0; justify-content: center; flex-grow: 0; padding-bottom: var(--lumo-space-xl);">
  <label style="width: 70%; height: 100%; flex-shrink: 0; font-size: 400%; flex-grow: 1;" id="Labellogin">Iniciar sesión</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; width: 80%; flex-grow: 0; justify-content: space-evenly; height: 50%; padding-top: var(--lumo-space-xl);" id="Layoutopcioneslogin">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutusuariologin">
    <label style="width: 35%; flex-shrink: 0; align-self: center; font-size: 120%;" id="Labelusuariologin">Usuario </label>
    <vaadin-text-field placeholder="Nombre Usuario" id="Textfieldusuariologin" style="flex-shrink: 0; width: 50%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; padding-bottom: var(--lumo-space-xl);" id="Layoutcontrasenalogin">
    <label style="width: 35%; flex-shrink: 0; align-self: center; font-size: 120%;" id="Labelcontrasenalogin">Contraseña</label>
    <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; width: 50%;" has-value id="Passwordfieldogin"></vaadin-password-field>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-button style="flex-shrink: 0; align-self: center; width: 20%;" id="Buttonentrarlogin">
    Entrar 
  </vaadin-button>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; justify-content: space-around; padding-top: var(--lumo-space-l);" id="Layoutregistrarselogin">
   <label style="flex-shrink: 0; font-size: 150%;" id="Labelnoestasregistrado">¿No estas registrado?</label>
   <vaadin-button style="flex-shrink: 0; align-self: center; width: 40%;" id="Buttonregistrarselogin">
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
