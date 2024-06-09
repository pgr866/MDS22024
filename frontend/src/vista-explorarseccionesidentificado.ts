import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-explorarseccionesidentificado')
export class VistaExplorarseccionesidentificado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; flex-shrink: 0; align-items: center; position: absolute;">
 <label id="Labelexplorarseccionesidentificado" style="flex-shrink: 0; align-self: center; font-size: 200%; text-align: center;">Explorar Secciones</label>
 <vaadin-vertical-layout style="width: 60%; flex-shrink: 0; padding: var(--lumo-space-m); padding-bottom: var(--lumo-space-l);">
  <vaadin-vertical-layout id="Layoutseccionesexplorarseccionesidentificado" style="width: 100%; flex-shrink: 0; position: relative; padding: 0;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 60%; justify-content: space-between; flex-shrink: 0; align-items: center; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);" id="Layoutnombrebotonesexplorarseccionesidentificado">
  <vaadin-text-field placeholder="Nombre nueva sección" style="flex-shrink: 0; width: 45%;" id="Textfieldnombreexplorarseccionesidentificado"></vaadin-text-field>
  <vaadin-button style="width: 25%; flex-shrink: 0;" id="Buttonanadirseccionexplorarseccionesidentificado">
    Añadir sección 
  </vaadin-button>
  <vaadin-button style="width: 25%; flex-shrink: 0;" id="Buttoneliminarexplorarseccionesidentificado">
    Eliminar sección 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; padding: 0; padding-top: var(--lumo-space-l);">
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; padding: 0; position: relative; align-items: center;" id="Layoutvistasnoticiasenseccionexplorarseccionesidentificado"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
