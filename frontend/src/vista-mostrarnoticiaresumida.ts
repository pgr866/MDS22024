import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-mostrarnoticiaresumida')
export class VistaMostrarnoticiaresumida extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; position: absolute; padding-top: var(--lumo-space-xl);" id="Layoutresumenmostrarnoticiaresumida">
 <vaadin-text-area style="width: 100%; flex-shrink: 0; align-self: stretch; height: 100%;" readonly value="Resumen" has-value id="Textarearesumenmostrarnoticiaresumida"></vaadin-text-area>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
