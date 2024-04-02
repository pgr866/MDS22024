import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-mostrarvaloracioncomentario')
export class VistaMostrarvaloracioncomentario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; flex-shrink: 0; height: 100%; justify-content: space-around;" id="Layoutnumeromegustanomegustamostrarvaloracioncomentario">
 <label style="width: 100%; flex-shrink: 1;" id="Numeromegustamostrarvaloracioncomentario">N</label>
 <label style="width: 100%;" id="Numeronomegustamostrarvaloracioncomentario">N</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
