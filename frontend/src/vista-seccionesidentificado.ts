import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-seccionesidentificado')
export class VistaSeccionesidentificado extends LitElement {
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
<vaadin-vertical-layout theme="" style="position: absolute; width: 100%;" id="Layoutseccionesidentificado">
 <vaadin-combo-box style="width: 100%; flex-shrink: 0; height: 100%; padding: 0;" placeholder="Busque una Sección" id="Comboboxseccionesidentificado">
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
