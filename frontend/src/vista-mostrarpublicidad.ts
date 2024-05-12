import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-mostrarpublicidad')
export class VistaMostrarpublicidad extends LitElement {
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
<vaadin-vertical-layout style="position: absolute;" id="Layoutanunciomostrarpublidad">
 <vaadin-button style="background-color: white; flex-shrink: 0; flex-grow: 0; width: 100%; height: 100%;" id="Buttonanunciomostrarpublidad">
  <img src="https://i.postimg.cc/Vs0hp5Rx/anuncio.png" id="Imagenmostrarpublidad" style="width: 100%; height: 100%;">
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
