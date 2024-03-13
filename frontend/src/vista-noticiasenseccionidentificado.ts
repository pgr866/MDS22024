import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-wrap: wrap; flex-direction: row; justify-content: space-between;">
 <vaadin-text-field style="width: 100%; flex-shrink: 0;" readonly value="Sección"></vaadin-text-field>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
