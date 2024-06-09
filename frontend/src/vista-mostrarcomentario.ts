import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-mostrarcomentario')
export class VistaMostrarcomentario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; justify-content: center; height: 100%; position: absolute;" id="Layoutmostrarcomentario">
 <vaadin-text-area style="width: 100%; flex-shrink: 1; align-self: stretch; height: 100%; font-size: 110%;" readonly has-value value="Contenido del comentario" id="Textareacontenidocomentario"></vaadin-text-area>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
