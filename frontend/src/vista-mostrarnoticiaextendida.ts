import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-mostrarnoticiaextendida')
export class VistaMostrarnoticiaextendida extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; justify-content: center; position: absolute;" id="Layoutmostrarnoticiaextendida">
 <vaadin-text-area style="width: 100%; flex-shrink: 0; align-self: stretch;" readonly value="Contenido" has-value id="Textareamostrarnoticiaextendida"></vaadin-text-area>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
