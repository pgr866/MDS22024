import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-noticiasenseccionusuarionoregistrado_item')
export class VistaNoticiasenseccionusuarionoregistrado_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding-bottom: var(--lumo-space-l);">
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; padding-bottom: var(--lumo-space-s);">
  <vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0;">
   <vaadin-button style="flex-shrink: 0; width: 100%; height: 100%; background-color: #FFFFFF;">
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-direction: column; height: 48%; display: flex; flex-direction: column; justify-content: space-between;">
  <img style="flex-shrink: 0; width: 100%; flex-grow: 0; height: 90%; z-index: -1;" src="data:image/jpeg;base64,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">
  <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; justify-content: space-between; flex-grow: 0;">
   <vaadin-text-field style="flex-shrink: 0; width: 33%; height: 100%; flex-grow: 0;" readonly value="Fecha" has-value></vaadin-text-field>
   <vaadin-text-field style="flex-shrink: 0; width: 33%; height: 100%;" readonly value="Autor" has-value></vaadin-text-field>
   <vaadin-text-field style="flex-shrink: 0; width: 33%; height: 100%;" readonly value="Lugar" has-value></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-m); flex-grow: 1;">
  <vaadin-text-area style="width: 100%; flex-shrink: 0; align-self: flex-start; height: 100%;" readonly value="Resumen" has-value></vaadin-text-area>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}