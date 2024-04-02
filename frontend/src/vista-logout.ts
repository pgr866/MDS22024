import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-logout')
export class VistaLogout extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="Layoutbotonlogout">
 <vaadin-button style="height: 100%; flex-shrink: 0; width: 100%; flex-grow: 0; background-color: #EBEBEB;" id="Buttonlogout">
  <img style="height: 100%; width: 100%;" src="../../src/main/resources/META-INF/resources/images/cerrarsesion.svg">
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
