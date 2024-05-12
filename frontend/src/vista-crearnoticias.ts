import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0; align-items: center; position: absolute;">
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layouttitulocrearnoticias">
  <label style="width: 20%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labeltitulocrearnoticias">Titulo noticia</label>
  <vaadin-text-field placeholder="Titular" style="flex-shrink: 0; flex-grow: 0; background-color: white; width: 70%;" id="Textfieldtitulocrearnoticias"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layouturlimagenescrearnoticias">
  <label style="width: 20%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labelurlimagenescrearnoticias">Url Imagenes</label>
  <vaadin-text-field placeholder="Url Imagenes" style="flex-shrink: 0; flex-grow: 0; width: 70%;" id="Textfieldurlimagenescrearnoticias"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 35%; justify-content: center; align-items: center;" id="Layoutcontenidocrearnoticias">
  <label style="width: 20%; flex-shrink: 0; flex-grow: 0; align-self: flex-start; font-size: 120%;" id="Labelcontenidocrearnoticias">Contenido noticia</label>
  <vaadin-text-area placeholder="Contenido noticia" style="flex-grow: 0; flex-shrink: 0; align-self: stretch; width: 70%;" id="Textareacontenidocrearnoticias"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layoutfechalugarcrearnoticias">
  <label style="width: 20%; flex-shrink: 0; flex-grow: 0;" id="Labelfechalugarcrearnoticias">Fecha y lugar</label>
  <vaadin-horizontal-layout style="width: 70%; flex-shrink: 0; justify-content: space-between;" id="Layouttextfieldfechalugarcrearnoticias">
   <vaadin-text-field placeholder="Fecha" style="flex-shrink: 0; flex-grow: 0; width: 45%;" id="Textfieldfechacrearnoticias"></vaadin-text-field>
   <vaadin-text-field placeholder="Lugar" style="flex-shrink: 0; flex-grow: 0; width: 45%;" id="Textfiedlugarcrearnoticias"></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layouttematicacrearnoticias">
  <label style="width: 20%; flex-shrink: 0; flex-grow: 0;" id="Labeltematicacrearnoticias">Tematica</label>
  <vaadin-text-field placeholder="Tematica" style="flex-shrink: 0; flex-grow: 0; width: 70%;" id="Textfieldtematicacrearnoticias"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layoutbotoncrearnoticias">
  <vaadin-button style="flex-shrink: 0; width: 20%;" id="Buttoncrearnoticias">
    Crear Noticia 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
