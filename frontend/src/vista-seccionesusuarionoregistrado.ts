import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';

@customElement('vista-seccionesusuarionoregistrado')
export class VistaSeccionesusuarionoregistrado extends LitElement {
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
<vaadin-vertical-layout theme="" style="position: absolute; width: 100%; height: 100%;" id="Layoutseccionesusuarionoregistrado">
 <vaadin-select style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 100%;" id="Desplegableseccionesusuarionoregistrado" placeholder="Selecciona una sección" dir="Selectsecciones">
  <template>
   <vaadin-list-box selected="0" id="Listboxseccionesusuarionoregistrado" value=""></vaadin-list-box>
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
