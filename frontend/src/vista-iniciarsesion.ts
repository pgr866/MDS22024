import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="Layoutlogin" style="width: 100%; height: 100%;">
  <vaadin-text-field label="Password" placeholder="Placeholder" id="Passwordlogin"></vaadin-text-field>
  <vaadin-text-field label="Username" placeholder="Placeholder" id="Usernamelogin"></vaadin-text-field>
  <vaadin-button id="Botonlogin">
   Log in
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
