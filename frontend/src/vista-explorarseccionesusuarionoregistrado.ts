import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0; align-items: center; position: absolute;">
 <vaadin-vertical-layout style="width: 60%; height: 8%; flex-shrink: 0;">
  <vaadin-vertical-layout id="Layoutseccionesexplorarseccionesusuarionoregistrado" style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; flex-direction: column; position: relative; padding: 0;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0;">
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; flex-grow: 1; justify-content: space-between; position: relative;" id="Layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
