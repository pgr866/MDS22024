import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-seccioncomentarios')
export class VistaSeccioncomentarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between; position: absolute;" id="Layoutseccioncomentarios">
 <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 0; width: 100%; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-s); padding-bottom: var(--lumo-space-s); padding-left: var(--lumo-space-s); padding: var(--lumo-space-s); position: relative;" id="Layoutvistaseccioncomentarios"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
