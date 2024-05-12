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
<vaadin-vertical-layout style="width: 100%; position: absolute;" id="Layoutnoticiasenseccionidentificado">
 <label style="font-size: 150%; text-jutify: center; align-self: center;" id="Labelseccoinnoticiasenseccionidentificado">Seccion</label>
 <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;">
  <vaadin-horizontal-layout theme="" style="width: 100%; flex-shrink: 0; flex-direction: row; justify-content: space-between; flex-wrap: wrap; padding: var(--lumo-space-m); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); flex-grow: 0; position: relative;" id="Noticiasenseccionidentificado"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
