import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-crearnoticias')
export class VistaCrearnoticias extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="" style="width: 100%; height: 15%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 85%; flex-shrink: 0; align-items: center;">
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0;">Titulo noticia</label>
   <vaadin-text-field placeholder="Titular" style="flex-shrink: 0; flex-grow: 1;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0;">Url Imagenes</label>
   <vaadin-text-field placeholder="Url Imagenes" style="flex-shrink: 0; flex-grow: 1;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 35%; justify-content: center; align-items: center;">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0; align-self: flex-start;">Contenido noticia</label>
   <vaadin-text-area placeholder="Contenido noticia" style="flex-grow: 1; align-self: stretch; flex-shrink: 0;"></vaadin-text-area>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0;">Fecha y lugar</label>
   <vaadin-horizontal-layout style="width: 80%; flex-shrink: 0; justify-content: space-between;">
    <vaadin-text-field placeholder="Url Imagenes" style="flex-shrink: 0; flex-grow: 0; width: 45%;"></vaadin-text-field>
    <vaadin-text-field placeholder="Url Imagenes" style="flex-shrink: 0; flex-grow: 0; width: 45%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0;">Tematica</label>
   <vaadin-text-field placeholder="Tematica" style="flex-shrink: 0; flex-grow: 1;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;">
   <vaadin-button style="width: 27%;">
    Crear Noticia
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
