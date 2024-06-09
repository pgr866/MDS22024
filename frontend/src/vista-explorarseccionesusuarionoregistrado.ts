import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-explorarseccionesusuarionoregistrado')
export class VistaExplorarseccionesusuarionoregistrado extends LitElement {
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
 <label id="Labelexplorarseccionesusuarionoregistrado" style="flex-shrink: 0; align-self: center; font-size: 200%; text-align: center;">Explorar Secciones</label>
 <vaadin-vertical-layout style="width: 80%; flex-shrink: 0; padding: var(--lumo-space-m);">
  <vaadin-vertical-layout id="Layoutseccionesexplorarseccionesusuarionoregistrado" style="width: 100%; flex-shrink: 0; position: relative; padding: 0;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; width: 90%; padding: 0; padding-top: var(--lumo-space-xl);">
  <vaadin-vertical-layout id="Layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado" style="flex-shrink: 0; width: 100%; padding: 0; position: relative; align-items: center;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
