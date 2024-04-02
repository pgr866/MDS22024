import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadonoticiasbusquedausuarionoregistrado';
import './vista-listadonoticiasbusquedaidentificado';

@customElement('vista-buscar')
export class VistaBuscar extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; justify-content: center;">
 <vista-listadonoticiasbusquedausuarionoregistrado style="flex-shrink: 0; width: 100%; height: 100%;"></vista-listadonoticiasbusquedausuarionoregistrado>
 <vista-listadonoticiasbusquedaidentificado style="flex-shrink: 0; width: 100%; height: 100%;"></vista-listadonoticiasbusquedaidentificado>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
