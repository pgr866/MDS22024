import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;" id="LayoutBuscar">
 <vaadin-combo-box style="width: 100%; flex-shrink: 1;" placeholder="Barra de Búsqueda" .items="${['Noticia1', 'Noticia2']}" id="ComboboxBuscar">
  <iron-icon icon="lumo:search" slot="prefix" id="Lupalistadoperiodistas"></iron-icon>
 </vaadin-combo-box>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
