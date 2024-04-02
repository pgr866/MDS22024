import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-listaperiodistas_item')
export class VistaListaperiodistas_item extends LitElement {
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
Periodista
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
