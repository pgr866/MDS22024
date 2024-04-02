import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-secciones_item')
export class VistaSecciones_item extends LitElement {
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
<vaadin-item id="Itemsecciones" dir="Seccion">
  Seccion1 
</vaadin-item>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
