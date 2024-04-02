import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-listadonoticiasbusquedaidentificado_item')
export class VistaListadonoticiasbusquedaidentificado_item extends LitElement {
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
Noticia
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
