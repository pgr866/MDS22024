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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; padding-top: var(--lumo-space-m); padding-right: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-left: var(--lumo-space-m); position: absolute;" theme="spacing-xl">
 <vaadin-horizontal-layout id="Layoutlogin" style="width: 100%; flex-shrink: 0; flex-grow: 0; justify-content: center;">
  <label style="flex-shrink: 0; font-size: 400%; flex-grow: 0;" id="Labellogin">Iniciar sesión</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; width: 60%; flex-grow: 0; justify-content: space-evenly;" id="Layoutopcioneslogin" theme="spacing-l">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0;" theme="spacing">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;" id="Layoutemaillogin">
    <label style="width: 25%; flex-shrink: 0; align-self: center; font-size: 120%;" id="Labelemaillogin">Email </label>
    <vaadin-text-field placeholder="Email" id="Textfieldemaillogin" style="flex-shrink: 0; width: 50%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;" id="Layoutcontrasenalogin">
    <label style="width: 25%; flex-shrink: 0; align-self: center; font-size: 120%;" id="Labelcontrasenalogin">Contraseña</label>
    <vaadin-password-field placeholder="Contraseña" style="flex-shrink: 0; width: 50%;" has-value id="Passwordfieldogin"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 1; justify-content: center; flex-direction: column;" id="Layoutmensajeerrorlogin">
    <label style="flex-shrink: 0; font-size: 120%; width: 100%; align-self: center; font-size: 100%; text-align: center; color: #FF0000;" id="Labelmensajeerrorlogin"></label>
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
