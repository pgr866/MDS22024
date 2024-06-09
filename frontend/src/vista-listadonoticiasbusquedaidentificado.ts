import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-listadonoticiasbusquedaidentificado')
export class VistaListadonoticiasbusquedaidentificado extends LitElement {
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
<vaadin-vertical-layout theme="" style="position: absolute; width: 100%;" id="Layoutlistadonoticiasbusquedaidentificado">
 <vaadin-combo-box style="width: 100%; flex-shrink: 0; height: 100%;" placeholder="Barra de Búsqueda" id="Comboboxlistadonoticiasbusquedaidentificado">
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
