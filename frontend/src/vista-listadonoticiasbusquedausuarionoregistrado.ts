import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-listadonoticiasbusquedausuarionoregistrado')
export class VistaListadonoticiasbusquedausuarionoregistrado extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; justify-content: center;" id="Layoutlistadonoticiasbusquedausuarionoregistrado">
 <vaadin-combo-box style="width: 100%; flex-shrink: 0;" placeholder="Barra Búsqueda" .items="${['Noticia1', 'Noticia2']}" id="Comboboxlistadonoticiasbusquedausuarionoregistrado">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-combo-box>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
