import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-noticiasenseccionidentificado')
export class VistaNoticiasenseccionidentificado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; padding: 0;" id="Layoutnoticiasenseccionidentificado">
 <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; padding: 0;">
  <vaadin-horizontal-layout theme="" style="width: 100%; flex-shrink: 0; padding: 0; flex-grow: 0; flex-wrap: wrap; .item:first-child {margin-left: S; }; flex-direction: row;" id="Noticiasenseccionidentificado">
   <div style="max-width: 1%;"></div>
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
