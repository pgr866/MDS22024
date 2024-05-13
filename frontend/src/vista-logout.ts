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
<vaadin-vertical-layout style="position: absolute;" id="Layoutbotonlogout">
 <vaadin-button style="flex-shrink: 0; flex-grow: 0; background-color: #EBEBEB; width: 100%; height: 100%;" id="Buttonlogout">
  <img style="width: 100%; height: 100%;" src="https://i.postimg.cc/0yRcLfQm/cerrarsesion.png" id="Imagenlogout">
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
