import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import './vista-secciones_item';

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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; justify-content: center;" id="Layoutsecciones">
 <vaadin-select style="width: 100%; flex-shrink: 0; flex-grow: 0;" id="Desplegablesecciones" placeholder="Selecciona una sección" dir="Selectsecciones">
  <template>
   <vaadin-list-box selected="0" id="Listboxsecciones" value="">
    <vista-secciones_item></vista-secciones_item>
   </vaadin-list-box>
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
