import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-secciones')
export class VistaSecciones extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;">
 <vaadin-text-field style="align-self: center; flex-shrink: 1; flex-grow: 0;" readonly value="Secciones" has-value></vaadin-text-field>
 <vaadin-select value="Item one" style="width: 100%; flex-shrink: 1; flex-grow: 0;" label="Selecciona una sección:">
  <template>
   <vaadin-list-box selected="0"></vaadin-list-box>
  </template>
 </vaadin-select>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
